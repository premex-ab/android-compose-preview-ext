package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EVOLVEO device specifications for Android Compose previews.
 *
 * This extension provides EVOLVEO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EVOLVEO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EVOLVEO: Any
  get() = object {
      /** EVOLVEO EVOLVEOG2 */
      val EVOLVEOG2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** EVOLVEO EVOLVEOG4 */
      val EVOLVEOG4 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** EVOLVEO EVOLVEOG8 */
      val EVOLVEOG8 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** EVOLVEO StrongPhoneG5 */
      val STRONGPHONEG5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** EVOLVEO StrongPhone_G7 */
      val STRONGPHONE_G7 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** EVOLVEO StrongPhone_G9 */
      val STRONGPHONE_G9 = "spec:width=720,height=1520,unit=px,dpi=320"

  }
