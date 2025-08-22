package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MyPhone device specifications for Android Compose previews.
 *
 * This extension provides MyPhone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MyPhone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MyPhone: Any
  get() = object {
      /** MyPhone myA17 */
      val MYA17 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** MyPhone myA18 */
      val MYA18 = "spec:width=480,height=800,unit=px,dpi=240"

      /** MyPhone myA1_Plus */
      val MYA1_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** MyPhone myG1 */
      val MYG1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** MyPhone myP1 */
      val MYP1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** MyPhone MyPhone_my96_DTV */
      val MYPHONE_MY96_DTV = "spec:width=720,height=1280,unit=px,dpi=320"

      /** MyPhone myT10 */
      val MYT10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MyPhone myT5_DTV */
      val MYT5_DTV = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MyPhone myT6S */
      val MYT6S = "spec:width=600,height=1024,unit=px,dpi=213"

      /** MyPhone myT6_DTV */
      val MYT6_DTV = "spec:width=600,height=1024,unit=px,dpi=213"

      /** MyPhone myT8 */
      val MYT8 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** MyPhone myT8S */
      val MYT8S = "spec:width=800,height=1280,unit=px,dpi=240"

      /** MyPhone myWX1_Plus */
      val MYWX1_PLUS = "spec:width=720,height=1520,unit=px,dpi=320"

      /** MyPhone myWX2 */
      val MYWX2 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** MyPhone myWX2_Pro */
      val MYWX2_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** MyPhone myX12 */
      val MYX12 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** MyPhone myX2 */
      val MYX2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** MyPhone myX8 */
      val MYX8 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** MyPhone myXI1_Plus */
      val MYXI1_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** MyPhone myXI1_Pro */
      val MYXI1_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** MyPhone myXI3 */
      val MYXI3 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
