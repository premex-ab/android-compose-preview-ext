package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NAVITEL device specifications for Android Compose previews.
 *
 * This extension provides NAVITEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Navitel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Navitel: Any
  get() = object {
      /** NAVITEL NAVITEL_T700_3G_NAVI */
      val NAVITEL_T700_3G_NAVI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** NAVITEL NAVITEL_T757LTE */
      val NAVITEL_T757LTE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** NAVITEL NAVITEL_T797_4G */
      val NAVITEL_T797_4G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** NAVITEL T500_3G */
      val T500_3G = "spec:width=800,height=1280,unit=px,dpi=240"

      /** NAVITEL T505PRO */
      val T505PRO = "spec:width=600,height=1024,unit=px,dpi=160"

      /** NAVITEL T707_3G */
      val T707_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** NAVITEL T737PRO */
      val T737PRO = "spec:width=600,height=1024,unit=px,dpi=160"

      /** NAVITEL T787-4G */
      val T787_4G = "spec:width=600,height=1024,unit=px,dpi=160"

  }
