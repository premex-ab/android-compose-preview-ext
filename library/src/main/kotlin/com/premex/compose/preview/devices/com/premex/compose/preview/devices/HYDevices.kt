package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HY device specifications for Android Compose previews.
 *
 * This extension provides HY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HY: Any
  get() = object {
      /** DeviceSpec(manufacturer=HY, code=HT10LA3MSGNA01, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HY, code=HT10LA3MSGNA01,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val HT10LA3MSGNA01 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=HY, code=HT10LB4MSGNA01, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HY, code=HT10LB4MSGNA01, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val HT10LB4MSGNA01 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HY, code=HT10WB3MSG01, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HY, code=HT10WB3MSG01, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val HT10WB3MSG01 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HY, code=HT8WB3RBK01, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HY, code=HT8WB3RBK01, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val HT8WB3RBK01 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
