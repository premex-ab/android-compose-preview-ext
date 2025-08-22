package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FOSSiBOT device specifications for Android Compose previews.
 *
 * This extension provides FOSSiBOT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fossibot.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fossibot: Any
  get() = object {
      /** FOSSiBOT DT1_Lite */
      val DT1_LITE = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** FOSSiBOT DT2 */
      val DT2 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** FOSSiBOT F101 */
      val F101 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** FOSSiBOT F101_P */
      val F101_P = "spec:width=720,height=1440,unit=px,dpi=280"

      /** FOSSiBOT F101_Pro */
      val F101_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** FOSSiBOT F102 */
      val F102 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** FOSSiBOT F105 */
      val F105 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** FOSSiBOT F106_Pro */
      val F106_PRO = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** FOSSiBOT F109 */
      val F109 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** FOSSiBOT F109_S */
      val F109_S = "spec:width=720,height=1600,unit=px,dpi=280"

      /** FOSSiBOT F112_Pro */
      val F112_PRO = "spec:width=720,height=1640,unit=px,dpi=280"

      /** FOSSiBOT FOSSiBOT_S2 */
      val FOSSIBOT_S2 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** FOSSiBOT S1 */
      val S1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** FOSSiBOT S3_Pro */
      val S3_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** FOSSiBOT Tab_12 */
      val TAB_12 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
