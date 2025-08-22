package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KYASTER device specifications for Android Compose previews.
 *
 * This extension provides KYASTER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kyaster.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kyaster: Any
  get() = object {
      /** KYASTER KPad_U2 */
      val KPAD_U2 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** KYASTER KPad_U2_P */
      val KPAD_U2_P = "spec:width=600,height=1024,unit=px,dpi=160"

      /** KYASTER KPad_U4 */
      val KPAD_U4 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** KYASTER KPad_U4_EEA */
      val KPAD_U4_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
