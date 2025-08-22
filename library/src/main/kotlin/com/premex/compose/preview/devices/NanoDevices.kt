package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Nano device specifications for Android Compose previews.
 *
 * This extension provides Nano device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nano.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nano: Any
  get() = object {
      /** Nano marina */
      val MARINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Nano martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Nano nagata */
      val NAGATA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Nano tamachi */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Nano yeongdeungpo */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
