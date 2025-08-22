package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * XGODY device specifications for Android Compose previews.
 *
 * This extension provides XGODY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XGODY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XGODY: Any
  get() = object {
      /** DeviceSpec(manufacturer=XGODY, code=Mate_70, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XGODY, code=Mate_70, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val MATE_70 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=XGODY, code=N02, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XGODY, code=N02, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val N02 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=XGODY, code=N02_A, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XGODY, code=N02_A, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val N02_A = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=XGODY, code=N02_ProA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XGODY, code=N02_ProA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val N02_PROA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=XGODY, code=P60Pro, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XGODY, code=P60Pro, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P60PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=XGODY, code=P60pro_15, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XGODY, code=P60pro_15, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P60PRO_15 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=XGODY, code=Q16, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XGODY, code=Q16, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Q16 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=XGODY, code=Q17, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XGODY, code=Q17, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Q17 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=XGODY, code=R15_EEA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XGODY, code=R15_EEA, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val R15_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=XGODY, code=T702, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XGODY, code=T702, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val T702 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=XGODY, code=T702E_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XGODY, code=T702E_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val T702E_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=XGODY, code=T702Pro_A, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XGODY, code=T702Pro_A, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val T702PRO_A = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=XGODY, code=T702Pro_S, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XGODY, code=T702Pro_S, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val T702PRO_S = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=XGODY, code=TAB10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XGODY, code=TAB10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TAB10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=XGODY, code=TAB_M10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XGODY, code=TAB_M10, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_M10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=XGODY, code=TAB_M10_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XGODY, code=TAB_M10_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_M10_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=XGODY, code=X32, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XGODY, code=X32, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val X32 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=XGODY, code=XGT_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XGODY, code=XGT_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val XGT_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

  }
