package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CONKER device specifications for Android Compose previews.
 *
 * This extension provides CONKER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CONKER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CONKER: Any
  get() = object {
      /** DeviceSpec(manufacturer=CONKER, code=ST_60, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CONKER, code=ST_60, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val ST_60 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CONKER, code=SX50, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CONKER, code=SX50, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SX50 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
