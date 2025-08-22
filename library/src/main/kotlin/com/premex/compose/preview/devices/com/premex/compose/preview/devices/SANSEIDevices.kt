package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SANSEI device specifications for Android Compose previews.
 *
 * This extension provides SANSEI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SANSEI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SANSEI: Any
  get() = object {
      /** DeviceSpec(manufacturer=SANSEI, code=TS10A1, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SANSEI, code=TS10A1, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TS10A1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SANSEI, code=TS7A1, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SANSEI, code=TS7A1, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TS7A1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SANSEI, code=TS7K, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SANSEI, code=TS7K, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TS7K = "spec:width=600,height=1024,unit=px,dpi=160"

  }
