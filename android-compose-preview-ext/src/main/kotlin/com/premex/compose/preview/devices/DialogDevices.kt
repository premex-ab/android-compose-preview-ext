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
      /** Dialog Dialog_Blaze_Mini */
      val DIALOG_BLAZE_MINI = "spec:width=480,height=800,unit=px,dpi=240"

      /** Dialog DV8829_Dialog */
      val DV8829_DIALOG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Dialog N9106H_B_Dialog */
      val N9106H_B_DIALOG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Dialog SEI103 */
      val SEI103 = "spec:width=720,height=1280,unit=px,dpi=213"

  }
