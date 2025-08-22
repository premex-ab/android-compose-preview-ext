package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VGO_TEL device specifications for Android Compose previews.
 *
 * This extension provides VGO_TEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VGOTEL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VGOTEL: Any
  get() = object {
      /** DeviceSpec(manufacturer=VGO_TEL, code=Flex_2, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VGO_TEL, code=Flex_2, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val FLEX_2 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VGO_TEL, code=NEW_10, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VGO_TEL, code=NEW_10, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val NEW_10 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=VGO_TEL, code=NEW_20, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VGO_TEL, code=NEW_20, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val NEW_20 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VGO_TEL, code=NOTE_23, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VGO_TEL, code=NOTE_23, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val NOTE_23 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=VGO_TEL, code=Smartphone, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VGO_TEL, code=Smartphone,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val SMARTPHONE = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VGO_TEL, code=SMART_8, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VGO_TEL, code=SMART_8, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val SMART_8 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
