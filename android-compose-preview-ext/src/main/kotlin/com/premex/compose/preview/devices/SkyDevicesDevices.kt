package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SKY_DEVICES device specifications for Android Compose previews.
 *
 * This extension provides SKY_DEVICES device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SkyDevices.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SkyDevices: Any
  get() = object {
      /** SKY_DEVICES Elite_D55 */
      val ELITE_D55 = "spec:width=480,height=960,unit=px,dpi=240"

      /** SKY_DEVICES SKY_KID1us */
      val SKY_KID1US = "spec:width=600,height=1024,unit=px,dpi=160"

  }
