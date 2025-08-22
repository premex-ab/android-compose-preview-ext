package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Xtratech device specifications for Android Compose previews.
 *
 * This extension provides Xtratech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Xtratech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Xtratech: Any
  get() = object {
      /** DeviceSpec(manufacturer=Xtratech, code=bnd8163_tb_n, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Xtratech, code=bnd8163_tb_n,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val BND8163_TB_N = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Xtratech, code=X10MT87, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Xtratech, code=X10MT87, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val X10MT87 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Xtratech, code=X8MT16, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Xtratech, code=X8MT16, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val X8MT16 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
