package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Dialog device specifications for Android Compose previews.
 *
 * This extension provides Dialog device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dialog.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dialog: Any
  get() = object {
      /** DeviceSpec(manufacturer=Dialog, code=Dialog_Blaze_Mini, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dialog, code=Dialog_Blaze_Mini,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val DIALOG_BLAZE_MINI = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Dialog, code=DV8829_Dialog, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dialog, code=DV8829_Dialog,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8829_DIALOG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Dialog, code=N9106H_B_Dialog, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dialog, code=N9106H_B_Dialog,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val N9106H_B_DIALOG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Dialog, code=SEI103, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dialog, code=SEI103, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SEI103 = "spec:width=720,height=1280,unit=px,dpi=213"

  }
