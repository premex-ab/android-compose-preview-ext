package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UROVO device specifications for Android Compose previews.
 *
 * This extension provides UROVO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Urovo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Urovo: Any
  get() = object {
      /** UROVO DT50_5G */
      val DT50_5G = "spec:width=720,height=1440,unit=px,dpi=320"

      /** UROVO DT66 */
      val DT66 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** UROVO SQ57 */
      val SQ57 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
