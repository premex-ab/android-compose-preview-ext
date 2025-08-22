package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ARRIS device specifications for Android Compose previews.
 *
 * This extension provides ARRIS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ARRIS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ARRIS: Any
  get() = object {
      /** ARRIS f503 */
      val F503 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ARRIS f515 */
      val F515 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ARRIS vip5242a */
      val VIP5242A = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ARRIS vip5442 */
      val VIP5442 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ARRIS vip5702w_tn */
      val VIP5702W_TN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ARRIS vip6102w */
      val VIP6102W = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ARRIS VIP7020_YouSee */
      val VIP7020_YOUSEE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ARRIS zc4450v_orm */
      val ZC4450V_ORM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ARRIS zc4455v_orb */
      val ZC4455V_ORB = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ARRIS zi4450v_ors */
      val ZI4450V_ORS = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
