package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * XTRATECH device specifications for Android Compose previews.
 *
 * This extension provides XTRATECH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XTRATECH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XTRATECH: Any
  get() = object {
      /** DeviceSpec(manufacturer=XTRATECH, code=BRIO_X31, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XTRATECH, code=BRIO_X31, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val BRIO_X31 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=XTRATECH, code=X10MT16, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XTRATECH, code=X10MT16, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val X10MT16 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=XTRATECH, code=X8MT87, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XTRATECH, code=X8MT87, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val X8MT87 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
