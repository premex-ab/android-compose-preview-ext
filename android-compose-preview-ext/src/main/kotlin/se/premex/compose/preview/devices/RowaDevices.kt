package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ROWA device specifications for Android Compose previews.
 *
 * This extension provides ROWA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Rowa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Rowa: Any
  get() = object {
      /** ROWA R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
