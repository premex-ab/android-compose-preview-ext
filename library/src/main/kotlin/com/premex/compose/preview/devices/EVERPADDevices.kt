package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EVERPAD device specifications for Android Compose previews.
 *
 * This extension provides EVERPAD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EVERPAD.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EVERPAD: Any
  get() = object {
      /** EVERPAD EVERPAD-EW2021 */
      val EVERPAD_EW2021 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** EVERPAD EW2010 */
      val EW2010 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** EVERPAD EW2020 */
      val EW2020 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** EVERPAD EW2022 */
      val EW2022 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
