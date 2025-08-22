package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * YOTOPT device specifications for Android Compose previews.
 *
 * This extension provides YOTOPT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Yotopt.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Yotopt: Any
  get() = object {
      /** YOTOPT Q11-EEA */
      val Q11_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** YOTOPT X109 */
      val X109 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** YOTOPT Y103_EEA */
      val Y103_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** YOTOPT Y121-EEA */
      val Y121_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** YOTOPT Y3-EEA */
      val Y3_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** YOTOPT Y61 */
      val Y61 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** YOTOPT Y61-EEA */
      val Y61_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** YOTOPT Y8-EEA */
      val Y8_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
