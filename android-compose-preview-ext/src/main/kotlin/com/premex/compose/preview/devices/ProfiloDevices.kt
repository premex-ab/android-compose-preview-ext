package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Profilo device specifications for Android Compose previews.
 *
 * This extension provides Profilo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Profilo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Profilo: Any
  get() = object {
      /** Profilo guandu */
      val GUANDU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Profilo marina */
      val MARINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Profilo martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Profilo tamachi */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Profilo yeongdeungpo */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
