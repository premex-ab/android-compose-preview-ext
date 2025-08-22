package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Fairphone device specifications for Android Compose previews.
 *
 * This extension provides Fairphone device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fairphone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fairphone: Any
  get() = object {
      /** Fairphone FP2 */
      val FP2 = "spec:width=1080,height=1920,unit=px,dpi=440"

      /** Fairphone FP3 */
      val FP3 = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** Fairphone FP4 */
      val FP4 = "spec:width=1080,height=2340,unit=px,dpi=400"

      /** Fairphone FP5 */
      val FP5 = "spec:width=1224,height=2700,unit=px,dpi=480"

      /** Fairphone FP6 */
      val FP6 = "spec:width=1116,height=2484,unit=px,dpi=480"

  }
