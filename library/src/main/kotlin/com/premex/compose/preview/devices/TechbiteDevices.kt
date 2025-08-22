package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * techbite device specifications for Android Compose previews.
 *
 * This extension provides techbite device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Techbite.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Techbite: Any
  get() = object {
      /** techbite SmartBoard_10_LTE */
      val SMARTBOARD_10_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** techbite smartboard_2 */
      val SMARTBOARD_2 = "spec:width=1200,height=1920,unit=px,dpi=286"

  }
