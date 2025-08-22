package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * X-mobile device specifications for Android Compose previews.
 *
 * This extension provides X-mobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XMobile: Any
  get() = object {
      /** X-mobile XM-SW1 */
      val XM_SW1 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
