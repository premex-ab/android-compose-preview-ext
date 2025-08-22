package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Altice device specifications for Android Compose previews.
 *
 * This extension provides Altice device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Altice.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Altice: Any
  get() = object {
      /** Altice E25 */
      val E25 = "spec:width=480,height=960,unit=px,dpi=200"

      /** Altice S13 */
      val S13 = "spec:width=540,height=1200,unit=px,dpi=240"

      /** Altice S14 */
      val S14 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Altice S23 */
      val S23 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Altice S24 */
      val S24 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Altice S25 */
      val S25 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Altice S32_NFC */
      val S32_NFC = "spec:width=480,height=960,unit=px,dpi=240"

      /** Altice S34 */
      val S34 = "spec:width=444,height=960,unit=px,dpi=200"

  }
