package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * redbeat device specifications for Android Compose previews.
 *
 * This extension provides redbeat device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Redbeat.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Redbeat: Any
  get() = object {
      /** redbeat D5 */
      val D5 = "spec:width=540,height=1200,unit=px,dpi=240"

      /** redbeat E3 */
      val E3 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** redbeat redbeatA2 */
      val REDBEATA2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** redbeat redbeatC1 */
      val REDBEATC1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** redbeat redbeatM2 */
      val REDBEATM2 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
