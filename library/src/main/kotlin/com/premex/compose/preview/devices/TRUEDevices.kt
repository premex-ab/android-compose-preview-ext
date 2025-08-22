package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TRUE device specifications for Android Compose previews.
 *
 * This extension provides TRUE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TRUE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TRUE: Any
  get() = object {
      /** TRUE Alpha_5G */
      val ALPHA_5G = "spec:width=720,height=1600,unit=px,dpi=300"

      /** TRUE SMART_4G_Champion */
      val SMART_4G_CHAMPION = "spec:width=480,height=800,unit=px,dpi=240"

      /** TRUE SMART_4G_M1_Plus */
      val SMART_4G_M1_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** TRUE SMART_Champ_4inch */
      val SMART_CHAMP_4INCH = "spec:width=480,height=800,unit=px,dpi=240"

      /** TRUE SMART_TAB_4G_e-Biz */
      val SMART_TAB_4G_E_BIZ = "spec:width=800,height=1280,unit=px,dpi=240"

      /** TRUE SMART_TAB_4G_e-Biz_PRO */
      val SMART_TAB_4G_E_BIZ_PRO = "spec:width=800,height=1280,unit=px,dpi=240"

      /** TRUE SMART_TAB_4G_M1 */
      val SMART_TAB_4G_M1 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
