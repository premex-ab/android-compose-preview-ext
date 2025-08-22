package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ARCHOS device specifications for Android Compose previews.
 *
 * This extension provides ARCHOS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ARCHOS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ARCHOS: Any
  get() = object {
      /** ARCHOS AC101XPro4G */
      val AC101XPRO4G = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** ARCHOS act101fhd2wf */
      val ACT101FHD2WF = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** ARCHOS ACT101FHD4G */
      val ACT101FHD4G = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** ARCHOS ACT101WF */
      val ACT101WF = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ARCHOS ACT110FHD4GULTRA */
      val ACT110FHD4GULTRA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** ARCHOS act80hdwf */
      val ACT80HDWF = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ARCHOS ARCHOS */
      val ARCHOS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ARCHOS ARCHOST96 */
      val ARCHOST96 = "spec:width=800,height=1280,unit=px,dpi=210"

      /** ARCHOS ARCHOST963G */
      val ARCHOST963G = "spec:width=800,height=1280,unit=px,dpi=210"

      /** ARCHOS X18_Ultra */
      val X18_ULTRA = "spec:width=1200,height=2000,unit=px,dpi=280"

  }
