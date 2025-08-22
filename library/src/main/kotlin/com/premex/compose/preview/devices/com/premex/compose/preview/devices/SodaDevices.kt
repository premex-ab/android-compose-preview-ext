package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * soda device specifications for Android Compose previews.
 *
 * This extension provides soda device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Soda.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Soda: Any
  get() = object {
      /** DeviceSpec(manufacturer=soda, code=Note_12, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=soda, code=Note_12, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val NOTE_12 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=soda, code=Note_12Pro, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=soda, code=Note_12Pro, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val NOTE_12PRO = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=soda, code=ROCK_30, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=soda, code=ROCK_30, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val ROCK_30 = "spec:width=720,height=1612,unit=px,dpi=320"

  }
