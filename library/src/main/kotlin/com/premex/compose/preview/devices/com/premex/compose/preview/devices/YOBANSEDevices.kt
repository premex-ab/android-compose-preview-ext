package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * YOBANSE device specifications for Android Compose previews.
 *
 * This extension provides YOBANSE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.YOBANSE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.YOBANSE: Any
  get() = object {
      /** DeviceSpec(manufacturer=YOBANSE, code=T88, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YOBANSE, code=T88, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val T88 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=YOBANSE, code=Y101, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YOBANSE, code=Y101, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Y101 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=YOBANSE, code=Z-T10, width=800, height=1280, dpi=190,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YOBANSE, code=Z-T10, width=800,
      height=1280, dpi=190, isGoogleDevice=false).code */
      val Z_T10 = "spec:width=800,height=1280,unit=px,dpi=190"

      /** DeviceSpec(manufacturer=YOBANSE, code=Z-TAB10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YOBANSE, code=Z-TAB10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Z_TAB10 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
