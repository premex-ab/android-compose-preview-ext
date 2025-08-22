package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TIM device specifications for Android Compose previews.
 *
 * This extension provides TIM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tim.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tim: Any
  get() = object {
      /** TIM m393gena_tim */
      val M393GENA_TIM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** TIM m393vsb_tim */
      val M393VSB_TIM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** TIM uzw4054tim */
      val UZW4054TIM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
