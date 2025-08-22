package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Logic device specifications for Android Compose previews.
 *
 * This extension provides Logic device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Logic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Logic: Any
  get() = object {
      /** Logic L55A */
      val L55A = "spec:width=480,height=960,unit=px,dpi=240"

      /** Logic Logic_L57 */
      val LOGIC_L57 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Logic MTK9679 */
      val MTK9679 = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** Logic rk3576_u */
      val RK3576_U = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** Logic X4 */
      val X4 = "spec:width=480,height=800,unit=px,dpi=240"

  }
