package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AZPEN device specifications for Android Compose previews.
 *
 * This extension provides AZPEN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AZPEN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AZPEN: Any
  get() = object {
      /** DeviceSpec(manufacturer=AZPEN, code=A1046G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AZPEN, code=A1046G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val A1046G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=AZPEN, code=G800, width=800, height=1280, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AZPEN, code=G800, width=800,
      height=1280, dpi=220, isGoogleDevice=false).code */
      val G800 = "spec:width=800,height=1280,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=AZPEN, code=mid1032_mk_32, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AZPEN, code=mid1032_mk_32,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val MID1032_MK_32 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
