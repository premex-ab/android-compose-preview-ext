package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * X-AGE device specifications for Android Compose previews.
 *
 * This extension provides X-AGE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XAGE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XAGE: Any
  get() = object {
      /** DeviceSpec(manufacturer=X-AGE, code=A1, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=X-AGE, code=A1, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val A1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=X-AGE, code=ACE, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=X-AGE, code=ACE, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ACE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=X-AGE, code=G1, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=X-AGE, code=G1, width=720,
      height=1500, dpi=320, isGoogleDevice=false).code */
      val G1 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=X-AGE, code=G1LITE, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=X-AGE, code=G1LITE, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val G1LITE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=X-AGE, code=G2, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=X-AGE, code=G2, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val G2 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=X-AGE, code=X_AGE_Leap_1, width=720, height=1612, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=X-AGE, code=X_AGE_Leap_1,
      width=720, height=1612, dpi=300, isGoogleDevice=false).code */
      val X_AGE_LEAP_1 = "spec:width=720,height=1612,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=X-AGE, code=X_AGE_Snap_1, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=X-AGE, code=X_AGE_Snap_1,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val X_AGE_SNAP_1 = "spec:width=720,height=1640,unit=px,dpi=320"

  }
