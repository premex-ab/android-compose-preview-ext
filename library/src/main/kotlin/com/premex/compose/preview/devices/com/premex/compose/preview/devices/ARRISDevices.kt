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
      /** DeviceSpec(manufacturer=ARRIS, code=f503, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARRIS, code=f503, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val F503 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ARRIS, code=f515, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARRIS, code=f515, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val F515 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ARRIS, code=vip5242a, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARRIS, code=vip5242a, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val VIP5242A = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ARRIS, code=vip5442, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARRIS, code=vip5442, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val VIP5442 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ARRIS, code=vip5702w_tn, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARRIS, code=vip5702w_tn,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val VIP5702W_TN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ARRIS, code=vip6102w, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARRIS, code=vip6102w, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val VIP6102W = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ARRIS, code=VIP7020_YouSee, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARRIS, code=VIP7020_YouSee,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val VIP7020_YOUSEE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ARRIS, code=zc4450v_orm, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARRIS, code=zc4450v_orm,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val ZC4450V_ORM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ARRIS, code=zc4455v_orb, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARRIS, code=zc4455v_orb,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val ZC4455V_ORB = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ARRIS, code=zi4450v_ors, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARRIS, code=zi4450v_ors,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val ZI4450V_ORS = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
