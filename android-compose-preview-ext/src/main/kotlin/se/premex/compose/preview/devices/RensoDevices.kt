package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * RENSO device specifications for Android Compose previews.
 *
 * This extension provides RENSO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Renso.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Renso: Any
  get() = object {
      /** RENSO NEP_N1 */
      val NEP_N1 = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
