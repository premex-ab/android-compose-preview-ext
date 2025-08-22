package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DL device specifications for Android Compose previews.
 *
 * This extension provides DL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DL: Any
  get() = object {
      /** DeviceSpec(manufacturer=DL, code=TabKids_Plus, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DL, code=TabKids_Plus, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TABKIDS_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DL, code=Tablet_DL_2810, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DL, code=Tablet_DL_2810, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TABLET_DL_2810 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DL, code=Tablet_DL_2811, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DL, code=Tablet_DL_2811, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TABLET_DL_2811 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DL, code=Tablet_DL_2820, width=768, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DL, code=Tablet_DL_2820, width=768,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TABLET_DL_2820 = "spec:width=768,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DL, code=Tablet_DL_3721, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DL, code=Tablet_DL_3721, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TABLET_DL_3721 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DL, code=Tablet_DL_3722, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DL, code=Tablet_DL_3722, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TABLET_DL_3722 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DL, code=Tablet_DL_3723, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DL, code=Tablet_DL_3723, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TABLET_DL_3723 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DL, code=Tablet_DL_3724, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DL, code=Tablet_DL_3724, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TABLET_DL_3724 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DL, code=Tablet_DL_3725, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DL, code=Tablet_DL_3725, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TABLET_DL_3725 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DL, code=Tablet_DL_4010, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DL, code=Tablet_DL_4010, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TABLET_DL_4010 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DL, code=X_Quad_Pro, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DL, code=X_Quad_Pro, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val X_QUAD_PRO = "spec:width=600,height=1024,unit=px,dpi=160"

  }
