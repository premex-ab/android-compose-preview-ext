package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HYUNDAI_MAESTRO device specifications for Android Compose previews.
 *
 * This extension provides HYUNDAI_MAESTRO device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HYUNDAIMAESTRO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HYUNDAIMAESTRO: Any
  get() = object {
      /** HYUNDAI_MAESTRO HDT_1064GS */
      val HDT_1064GS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** HYUNDAI_MAESTRO HDT_7433H_PLUS */
      val HDT_7433H_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

  }
