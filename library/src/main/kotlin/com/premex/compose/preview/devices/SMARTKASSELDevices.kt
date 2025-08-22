package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SMART_KASSEL device specifications for Android Compose previews.
 *
 * This extension provides SMART_KASSEL device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SMARTKASSEL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SMARTKASSEL: Any
  get() = object {
      /** SMART_KASSEL SK3401 */
      val SK3401 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** SMART_KASSEL SK3402 */
      val SK3402 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** SMART_KASSEL SK3403 */
      val SK3403 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** SMART_KASSEL SK3404 */
      val SK3404 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** SMART_KASSEL SK3405 */
      val SK3405 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** SMART_KASSEL SK3501 */
      val SK3501 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SMART_KASSEL SK5501 */
      val SK5501 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SMART_KASSEL SK5502 */
      val SK5502 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
