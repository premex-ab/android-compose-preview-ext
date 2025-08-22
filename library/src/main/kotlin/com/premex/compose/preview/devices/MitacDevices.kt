package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MiTAC device specifications for Android Compose previews.
 *
 * This extension provides MiTAC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mitac.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mitac: Any
  get() = object {
      /** MiTAC chiron_pro */
      val CHIRON_PRO = "spec:width=600,height=1024,unit=px,dpi=160"

      /** MiTAC hera_pro */
      val HERA_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** MiTAC surfing_pro */
      val SURFING_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

  }
