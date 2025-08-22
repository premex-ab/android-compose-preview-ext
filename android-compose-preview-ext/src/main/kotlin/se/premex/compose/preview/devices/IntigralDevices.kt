package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * INTIGRAL device specifications for Android Compose previews.
 *
 * This extension provides INTIGRAL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Intigral.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Intigral: Any
  get() = object {
      /** INTIGRAL HP40A */
      val HP40A = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
