package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SmartEver device specifications for Android Compose previews.
 *
 * This extension provides SmartEver device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Smartever.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Smartever: Any
  get() = object {
      /** SmartEver seocho */
      val SEOCHO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SmartEver shilin */
      val SHILIN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
