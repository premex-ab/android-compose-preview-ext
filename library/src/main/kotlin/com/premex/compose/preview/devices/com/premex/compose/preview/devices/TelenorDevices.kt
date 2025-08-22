package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Telenor device specifications for Android Compose previews.
 *
 * This extension provides Telenor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Telenor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Telenor: Any
  get() = object {
      /** DeviceSpec(manufacturer=Telenor, code=b3680, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Telenor, code=b3680, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val B3680 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Telenor, code=DV6113Z-KST, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Telenor, code=DV6113Z-KST,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val DV6113Z_KST = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Telenor, code=Hipernet_TV_Box_B866V2, width=1080, height=1920,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Telenor,
      code=Hipernet_TV_Box_B866V2, width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val HIPERNET_TV_BOX_B866V2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Telenor, code=i6379, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Telenor, code=i6379, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val I6379 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Telenor, code=MediaBox_B866V2, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Telenor, code=MediaBox_B866V2,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val MEDIABOX_B866V2 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
