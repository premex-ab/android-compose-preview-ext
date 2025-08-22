package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Sansui device specifications for Android Compose previews.
 *
 * This extension provides Sansui device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sansui.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sansui: Any
  get() = object {
      /** DeviceSpec(manufacturer=Sansui, code=Grand, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sansui, code=Grand, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val GRAND = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sansui, code=Sansui_Nova, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sansui, code=Sansui_Nova,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val SANSUI_NOVA = "spec:width=480,height=960,unit=px,dpi=240"

  }
