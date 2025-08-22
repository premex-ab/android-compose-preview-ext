package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Arknikko device specifications for Android Compose previews.
 *
 * This extension provides Arknikko device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Arknikko.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Arknikko: Any
  get() = object {
      /** Arknikko MemoPad_T3_EEA */
      val MEMOPAD_T3_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Arknikko Memopad_T4 */
      val MEMOPAD_T4 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Arknikko SophPad_X11 */
      val SOPHPAD_X11 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Arknikko SophPad_X22_EEA */
      val SOPHPAD_X22_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

  }
