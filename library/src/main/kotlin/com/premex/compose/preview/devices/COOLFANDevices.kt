package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * COOLFAN device specifications for Android Compose previews.
 *
 * This extension provides COOLFAN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.COOLFAN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.COOLFAN: Any
  get() = object {
      /** COOLFAN C107 */
      val C107 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** COOLFAN OC106 */
      val OC106 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** COOLFAN OC106_EEA */
      val OC106_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
