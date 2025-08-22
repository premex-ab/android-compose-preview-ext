package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EVOO device specifications for Android Compose previews.
 *
 * This extension provides EVOO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Evoo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Evoo: Any
  get() = object {
      /** EVOO EVMFV2 */
      val EVMFV2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** EVOO EV-A-101-3 */
      val EV_A_101_3 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** EVOO EV-A-116-1 */
      val EV_A_116_1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** EVOO EV-A-133-1 */
      val EV_A_133_1 = "spec:width=1080,height=1920,unit=px,dpi=213"

      /** EVOO EV-A-156-1 */
      val EV_A_156_1 = "spec:width=1080,height=1920,unit=px,dpi=160"

  }
