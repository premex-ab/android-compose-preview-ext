package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * G-Tab device specifications for Android Compose previews.
 *
 * This extension provides G-Tab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GTab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GTab: Any
  get() = object {
      /** DeviceSpec(manufacturer=G-Tab, code=C10X, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=C10X, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val C10X = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=G-Tab, code=C10_1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=C10_1, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val C10_1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=G-Tab, code=C10_2, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=C10_2, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val C10_2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=G-Tab, code=C10-pro, width=800, height=1280, dpi=186,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=C10-pro, width=800,
      height=1280, dpi=186, isGoogleDevice=false).code */
      val C10_PRO = "spec:width=800,height=1280,unit=px,dpi=186"

      /** DeviceSpec(manufacturer=G-Tab, code=C20, width=800, height=1280, dpi=170,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=C20, width=800,
      height=1280, dpi=170, isGoogleDevice=false).code */
      val C20 = "spec:width=800,height=1280,unit=px,dpi=170"

      /** DeviceSpec(manufacturer=G-Tab, code=C3, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=C3, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val C3 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=G-Tab, code=C30, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=C30, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val C30 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=G-Tab, code=C9, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=C9, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val C9 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=G-Tab, code=F1, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=F1, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val F1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=G-Tab, code=F1_1, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=F1_1, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val F1_1 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=G-Tab, code=F2, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=F2, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val F2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=G-Tab, code=F2X, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=F2X, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val F2X = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=G-Tab, code=F4, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=F4, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val F4 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=G-Tab, code=F8, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=F8, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val F8 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=G-Tab, code=F8X, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=F8X, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val F8X = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=G-Tab, code=F8_1, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=F8_1, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val F8_1 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=G-Tab, code=G9, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=G9, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val G9 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=G-Tab, code=N271, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=N271, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val N271 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=G-Tab, code=N28, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=N28, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val N28 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=G-Tab, code=N281, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=N281, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val N281 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=G-Tab, code=P2000, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=P2000, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P2000 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=G-Tab, code=P733, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=P733, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val P733 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=G-Tab, code=PAD10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=PAD10, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PAD10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=G-Tab, code=PAD10_PRO, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=PAD10_PRO, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PAD10_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=G-Tab, code=Q2, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=Q2, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val Q2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=G-Tab, code=Q2S, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=Q2S, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val Q2S = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=G-Tab, code=Q3, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=Q3, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val Q3 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=G-Tab, code=Q4, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=Q4, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val Q4 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=G-Tab, code=Q6, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=Q6, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val Q6 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=G-Tab, code=S10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=S10, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val S10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=G-Tab, code=S12, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=S12, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val S12 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=G-Tab, code=S20, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=S20, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val S20 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=G-Tab, code=S30, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=S30, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val S30 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=G-Tab, code=S30_1, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=S30_1, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val S30_1 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=G-Tab, code=S40, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=S40, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val S40 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=G-Tab, code=S40-1, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=S40-1, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val S40_1 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=G-Tab, code=S50, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=S50, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val S50 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=G-Tab, code=S50-pro, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=S50-pro, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val S50_PRO = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=G-Tab, code=S8, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=S8, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val S8 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=G-Tab, code=S8K_1, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=S8K_1, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val S8K_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=G-Tab, code=S8K_2, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=S8K_2, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val S8K_2 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=G-Tab, code=S8X, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=S8X, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val S8X = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=G-Tab, code=T10_1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=T10_1, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T10_1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=G-Tab, code=T11_1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=T11_1, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T11_1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=G-Tab, code=T11_PRO, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=T11_PRO, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T11_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=G-Tab, code=T8S_1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=T8S_1, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T8S_1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=G-Tab, code=T8_1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=T8_1, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T8_1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=G-Tab, code=T9_1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G-Tab, code=T9_1, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T9_1 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
