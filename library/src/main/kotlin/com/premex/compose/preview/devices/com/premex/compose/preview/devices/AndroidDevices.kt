package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Android device specifications for Android Compose previews.
 *
 * This extension provides Android device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Android.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Android: Any
  get() = object {
      /** DeviceSpec(manufacturer=Android, code=nanopc-t4, width=720, height=1200, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Android, code=nanopc-t4, width=720,
      height=1200, dpi=260, isGoogleDevice=false).code */
      val NANOPC_T4 = "spec:width=720,height=1200,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Android, code=rk322x_box, width=720, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Android, code=rk322x_box,
      width=720, height=1280, dpi=160, isGoogleDevice=false).code */
      val RK322X_BOX = "spec:width=720,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Android, code=rk3328_box, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Android, code=rk3328_box,
      width=1080, height=1920, dpi=240, isGoogleDevice=false).code */
      val RK3328_BOX = "spec:width=1080,height=1920,unit=px,dpi=240"

  }
