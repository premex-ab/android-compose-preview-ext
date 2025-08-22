package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * NKJ_AQT100 device specifications for Android Compose previews.
 *
 * This extension provides NKJ_AQT100 device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NkjAqt100.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NkjAqt100: Any
  get() = object {
      /** NKJ_AQT100 NKJ_AQT100 */
      val NKJ_AQT100 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
