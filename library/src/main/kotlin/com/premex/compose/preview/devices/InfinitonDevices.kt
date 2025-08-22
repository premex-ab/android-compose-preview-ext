package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * INFINITON device specifications for Android Compose previews.
 *
 * This extension provides INFINITON device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Infiniton.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Infiniton: Any
  get() = object {
      /** INFINITON nagata */
      val NAGATA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** INFINITON tamachi */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** INFINITON yeongdeungpo */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
