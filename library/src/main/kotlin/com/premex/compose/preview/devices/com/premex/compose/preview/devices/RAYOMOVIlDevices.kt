package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RAYO_MOVIl device specifications for Android Compose previews.
 *
 * This extension provides RAYO_MOVIl device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.RAYOMOVIl.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.RAYOMOVIl: Any
  get() = object {
      /** DeviceSpec(manufacturer=RAYO_MOVIl, code=Atlas, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAYO_MOVIl, code=Atlas, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val ATLAS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RAYO_MOVIl, code=ATLAS_2, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAYO_MOVIl, code=ATLAS_2,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val ATLAS_2 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RAYO_MOVIl, code=RAYO_X1, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAYO_MOVIl, code=RAYO_X1,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val RAYO_X1 = "spec:width=720,height=1560,unit=px,dpi=320"

  }
