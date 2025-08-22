package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Partner_Mobile device specifications for Android Compose previews.
 *
 * This extension provides Partner_Mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PartnerMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PartnerMobile: Any
  get() = object {
      /** Partner_Mobile E22 */
      val E22 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Partner_Mobile EV1_PRO */
      val EV1_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Partner_Mobile Partner_Evolution */
      val PARTNER_EVOLUTION = "spec:width=720,height=1520,unit=px,dpi=320"

  }
