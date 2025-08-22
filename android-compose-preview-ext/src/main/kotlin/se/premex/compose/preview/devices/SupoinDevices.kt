package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SUPOIN device specifications for Android Compose previews.
 *
 * This extension provides SUPOIN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Supoin.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Supoin: Any
  get() = object {
      /** SUPOIN S66 */
      val S66 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
