package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Redmi device specifications for Android Compose previews.
 *
 * This extension provides Redmi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Redmi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Redmi: Any
  get() = object {
      /** DeviceSpec(manufacturer=Redmi, code=aether, width=720, height=1650, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=aether, width=720,
      height=1650, dpi=320, isGoogleDevice=false).code */
      val AETHER = "spec:width=720,height=1650,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Redmi, code=air, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=air, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val AIR = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Redmi, code=alioth, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=alioth, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val ALIOTH = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=amethyst, width=1220, height=2712, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=amethyst, width=1220,
      height=2712, dpi=480, isGoogleDevice=false).code */
      val AMETHYST = "spec:width=1220,height=2712,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Redmi, code=angelica, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=angelica, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val ANGELICA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Redmi, code=angelican, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=angelican, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val ANGELICAN = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Redmi, code=apollo, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=apollo, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val APOLLO = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=ares, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=ares, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val ARES = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=atmos, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=atmos, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val ATMOS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Redmi, code=atom, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=atom, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val ATOM = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=begonia, width=1080, height=2340, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=begonia, width=1080,
      height=2340, dpi=440, isGoogleDevice=false).code */
      val BEGONIA = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=begoniain, width=1080, height=2340, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=begoniain, width=1080,
      height=2340, dpi=440, isGoogleDevice=false).code */
      val BEGONIAIN = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=beryl, width=1080, height=2400, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=beryl, width=1080,
      height=2400, dpi=450, isGoogleDevice=false).code */
      val BERYL = "spec:width=1080,height=2400,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=Redmi, code=biloba, width=1080, height=2340, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=biloba, width=1080,
      height=2340, dpi=440, isGoogleDevice=false).code */
      val BILOBA = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=blue, width=720, height=1650, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=blue, width=720,
      height=1650, dpi=320, isGoogleDevice=false).code */
      val BLUE = "spec:width=720,height=1650,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Redmi, code=bomb, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=bomb, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val BOMB = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=breeze, width=1080, height=2460, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=breeze, width=1080,
      height=2460, dpi=440, isGoogleDevice=false).code */
      val BREEZE = "spec:width=1080,height=2460,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=camellia, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=camellia, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val CAMELLIA = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=camellian, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=camellian, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val CAMELLIAN = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=cannon, width=1080, height=2340, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=cannon, width=1080,
      height=2340, dpi=440, isGoogleDevice=false).code */
      val CANNON = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=cannong, width=1080, height=2340, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=cannong, width=1080,
      height=2340, dpi=440, isGoogleDevice=false).code */
      val CANNONG = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=cattail, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=cattail, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val CATTAIL = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Redmi, code=cezanne, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=cezanne, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val CEZANNE = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=chopin, width=1080, height=2248, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=chopin, width=1080,
      height=2248, dpi=480, isGoogleDevice=false).code */
      val CHOPIN = "spec:width=1080,height=2248,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Redmi, code=citrine, width=1080, height=2400, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=citrine, width=1080,
      height=2400, dpi=450, isGoogleDevice=false).code */
      val CITRINE = "spec:width=1080,height=2400,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=Redmi, code=cloud, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=cloud, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val CLOUD = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Redmi, code=corot, width=1220, height=2712, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=corot, width=1220,
      height=2712, dpi=480, isGoogleDevice=false).code */
      val COROT = "spec:width=1220,height=2712,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Redmi, code=curtana, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=curtana, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val CURTANA = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=dali, width=1280, height=2772, dpi=520,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=dali, width=1280,
      height=2772, dpi=520, isGoogleDevice=false).code */
      val DALI = "spec:width=1280,height=2772,unit=px,dpi=520"

      /** DeviceSpec(manufacturer=Redmi, code=dandelion, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=dandelion, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val DANDELION = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Redmi, code=diting, width=1220, height=2712, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=diting, width=1220,
      height=2712, dpi=480, isGoogleDevice=false).code */
      val DITING = "spec:width=1220,height=2712,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Redmi, code=dizi, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=dizi, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val DIZI = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Redmi, code=duchamp, width=1220, height=2712, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=duchamp, width=1220,
      height=2712, dpi=480, isGoogleDevice=false).code */
      val DUCHAMP = "spec:width=1220,height=2712,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Redmi, code=earth, width=720, height=1650, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=earth, width=720,
      height=1650, dpi=320, isGoogleDevice=false).code */
      val EARTH = "spec:width=720,height=1650,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Redmi, code=eos, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=eos, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val EOS = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=evergo, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=evergo, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val EVERGO = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=excalibur, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=excalibur, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val EXCALIBUR = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=fire, width=1080, height=2460, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=fire, width=1080,
      height=2460, dpi=440, isGoogleDevice=false).code */
      val FIRE = "spec:width=1080,height=2460,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=flame, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=flame, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val FLAME = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Redmi, code=flare, width=800, height=1340, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=flare, width=800,
      height=1340, dpi=213, isGoogleDevice=false).code */
      val FLARE = "spec:width=800,height=1340,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Redmi, code=fleur, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=fleur, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val FLEUR = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=fog, width=720, height=1650, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=fog, width=720,
      height=1650, dpi=320, isGoogleDevice=false).code */
      val FOG = "spec:width=720,height=1650,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Redmi, code=galahad, width=1080, height=2340, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=galahad, width=1080,
      height=2340, dpi=440, isGoogleDevice=false).code */
      val GALAHAD = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=gale, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=gale, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val GALE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Redmi, code=garnet, width=1220, height=2712, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=garnet, width=1220,
      height=2712, dpi=480, isGoogleDevice=false).code */
      val GARNET = "spec:width=1220,height=2712,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Redmi, code=gauguinpro, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=gauguinpro, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val GAUGUINPRO = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=gold, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=gold, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val GOLD = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=gust, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=gust, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val GUST = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Redmi, code=haydn, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=haydn, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val HAYDN = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=heat, width=1080, height=2460, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=heat, width=1080,
      height=2460, dpi=440, isGoogleDevice=false).code */
      val HEAT = "spec:width=1080,height=2460,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=ice, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=ice, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val ICE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Redmi, code=ingres, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=ingres, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val INGRES = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=iron, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=iron, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val IRON = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=joyeuse, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=joyeuse, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val JOYEUSE = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=klein, width=720, height=1650, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=klein, width=720,
      height=1650, dpi=320, isGoogleDevice=false).code */
      val KLEIN = "spec:width=720,height=1650,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Redmi, code=koto, width=1600, height=2560, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=koto, width=1600,
      height=2560, dpi=360, isGoogleDevice=false).code */
      val KOTO = "spec:width=1600,height=2560,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=Redmi, code=lake, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=lake, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val LAKE = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Redmi, code=lancelot, width=1080, height=2340, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=lancelot, width=1080,
      height=2340, dpi=440, isGoogleDevice=false).code */
      val LANCELOT = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=lemon, width=1080, height=2340, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=lemon, width=1080,
      height=2340, dpi=440, isGoogleDevice=false).code */
      val LEMON = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=light, width=1080, height=2408, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=light, width=1080,
      height=2408, dpi=440, isGoogleDevice=false).code */
      val LIGHT = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=lime, width=1080, height=2340, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=lime, width=1080,
      height=2340, dpi=440, isGoogleDevice=false).code */
      val LIME = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=lmi, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=lmi, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val LMI = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=lmipro, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=lmipro, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val LMIPRO = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=malachite, width=1220, height=2712, dpi=520,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=malachite, width=1220,
      height=2712, dpi=520, isGoogleDevice=false).code */
      val MALACHITE = "spec:width=1220,height=2712,unit=px,dpi=520"

      /** DeviceSpec(manufacturer=Redmi, code=maltose, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=maltose, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val MALTOSE = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=manet, width=1440, height=3200, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=manet, width=1440,
      height=3200, dpi=560, isGoogleDevice=false).code */
      val MANET = "spec:width=1440,height=3200,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=Redmi, code=marble, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=marble, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val MARBLE = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=matisse, width=1440, height=3200, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=matisse, width=1440,
      height=3200, dpi=560, isGoogleDevice=false).code */
      val MATISSE = "spec:width=1440,height=3200,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=Redmi, code=merlin, width=1080, height=2340, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=merlin, width=1080,
      height=2340, dpi=440, isGoogleDevice=false).code */
      val MERLIN = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=merlinnfc, width=1080, height=2340, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=merlinnfc, width=1080,
      height=2340, dpi=440, isGoogleDevice=false).code */
      val MERLINNFC = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=miel, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=miel, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val MIEL = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=miro, width=1080, height=2400, dpi=600,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=miro, width=1080,
      height=2400, dpi=600, isGoogleDevice=false).code */
      val MIRO = "spec:width=1080,height=2400,unit=px,dpi=600"

      /** DeviceSpec(manufacturer=Redmi, code=mondrian, width=1440, height=3200, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=mondrian, width=1440,
      height=3200, dpi=560, isGoogleDevice=false).code */
      val MONDRIAN = "spec:width=1440,height=3200,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=Redmi, code=moon, width=1080, height=2460, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=moon, width=1080,
      height=2460, dpi=440, isGoogleDevice=false).code */
      val MOON = "spec:width=1080,height=2460,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=munch, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=munch, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val MUNCH = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=obsidian, width=1080, height=2400, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=obsidian, width=1080,
      height=2400, dpi=450, isGoogleDevice=false).code */
      val OBSIDIAN = "spec:width=1080,height=2400,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=Redmi, code=ocean, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=ocean, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val OCEAN = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=olivewood, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=olivewood, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val OLIVEWOOD = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Redmi, code=onyx, width=1280, height=2772, dpi=520,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=onyx, width=1280,
      height=2772, dpi=520, isGoogleDevice=false).code */
      val ONYX = "spec:width=1280,height=2772,unit=px,dpi=520"

      /** DeviceSpec(manufacturer=Redmi, code=opal, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=opal, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val OPAL = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=pearl, width=1080, height=2460, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=pearl, width=1080,
      height=2460, dpi=440, isGoogleDevice=false).code */
      val PEARL = "spec:width=1080,height=2460,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=peridot, width=1220, height=2712, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=peridot, width=1220,
      height=2712, dpi=480, isGoogleDevice=false).code */
      val PERIDOT = "spec:width=1220,height=2712,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Redmi, code=peux, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=peux, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val PEUX = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=phoenix, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=phoenix, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val PHOENIX = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=picasso, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=picasso, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val PICASSO = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=pine, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=pine, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val PINE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Redmi, code=pissarro, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=pissarro, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val PISSARRO = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=pissarropro, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=pissarropro,
      width=1080, height=2400, dpi=440, isGoogleDevice=false).code */
      val PISSARROPRO = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=pomelo, width=1080, height=2340, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=pomelo, width=1080,
      height=2340, dpi=440, isGoogleDevice=false).code */
      val POMELO = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=pond, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=pond, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val POND = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Redmi, code=rain, width=720, height=1650, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=rain, width=720,
      height=1650, dpi=320, isGoogleDevice=false).code */
      val RAIN = "spec:width=720,height=1650,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Redmi, code=rango, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=rango, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val RANGO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Redmi, code=redwood, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=redwood, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val REDWOOD = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=rembrandt, width=1440, height=3200, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=rembrandt, width=1440,
      height=3200, dpi=560, isGoogleDevice=false).code */
      val REMBRANDT = "spec:width=1440,height=3200,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=Redmi, code=river, width=1080, height=2460, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=river, width=1080,
      height=2460, dpi=440, isGoogleDevice=false).code */
      val RIVER = "spec:width=1080,height=2460,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=rock, width=1080, height=2408, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=rock, width=1080,
      height=2408, dpi=440, isGoogleDevice=false).code */
      val ROCK = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=rodin, width=1220, height=2712, dpi=520,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=rodin, width=1220,
      height=2712, dpi=520, isGoogleDevice=false).code */
      val RODIN = "spec:width=1220,height=2712,unit=px,dpi=520"

      /** DeviceSpec(manufacturer=Redmi, code=rosemary, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=rosemary, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val ROSEMARY = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=rothko, width=1220, height=2712, dpi=520,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=rothko, width=1220,
      height=2712, dpi=520, isGoogleDevice=false).code */
      val ROTHKO = "spec:width=1220,height=2712,unit=px,dpi=520"

      /** DeviceSpec(manufacturer=Redmi, code=ruan, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=ruan, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val RUAN = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Redmi, code=rubens, width=1440, height=3200, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=rubens, width=1440,
      height=3200, dpi=560, isGoogleDevice=false).code */
      val RUBENS = "spec:width=1440,height=3200,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=Redmi, code=ruby, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=ruby, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val RUBY = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=rubyplus, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=rubyplus, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val RUBYPLUS = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=rubypro, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=rubypro, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val RUBYPRO = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=sapphire, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=sapphire, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val SAPPHIRE = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=sapphiren, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=sapphiren, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val SAPPHIREN = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=sea, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=sea, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val SEA = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=secret, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=secret, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val SECRET = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=selene, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=selene, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val SELENE = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=serenity, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=serenity, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val SERENITY = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Redmi, code=snow, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=snow, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val SNOW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Redmi, code=socrates, width=1440, height=3200, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=socrates, width=1440,
      height=3200, dpi=560, isGoogleDevice=false).code */
      val SOCRATES = "spec:width=1440,height=3200,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=Redmi, code=spark, width=800, height=1340, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=spark, width=800,
      height=1340, dpi=213, isGoogleDevice=false).code */
      val SPARK = "spec:width=800,height=1340,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Redmi, code=spes, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=spes, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val SPES = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=spesn, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=spesn, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val SPESN = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=sunny, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=sunny, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val SUNNY = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=sunstone, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=sunstone, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val SUNSTONE = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=sweet, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=sweet, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val SWEET = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=sweetin, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=sweetin, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val SWEETIN = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=taiko, width=1600, height=2560, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=taiko, width=1600,
      height=2560, dpi=360, isGoogleDevice=false).code */
      val TAIKO = "spec:width=1600,height=2560,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=Redmi, code=tanzanite, width=1080, height=2400, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=tanzanite, width=1080,
      height=2400, dpi=450, isGoogleDevice=false).code */
      val TANZANITE = "spec:width=1080,height=2400,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=Redmi, code=tapas, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=tapas, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val TAPAS = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=tarzan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=tarzan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TARZAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Redmi, code=thunder, width=1080, height=2408, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=thunder, width=1080,
      height=2408, dpi=440, isGoogleDevice=false).code */
      val THUNDER = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=tides, width=1080, height=2460, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=tides, width=1080,
      height=2460, dpi=440, isGoogleDevice=false).code */
      val TIDES = "spec:width=1080,height=2460,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=topaz, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=topaz, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val TOPAZ = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=vermeer, width=1440, height=3200, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=vermeer, width=1440,
      height=3200, dpi=560, isGoogleDevice=false).code */
      val VERMEER = "spec:width=1440,height=3200,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=Redmi, code=veux, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=veux, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val VEUX = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=vida, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=vida, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val VIDA = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=viva, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=viva, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val VIVA = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=warm, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=warm, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val WARM = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Redmi, code=water, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=water, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val WATER = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Redmi, code=wind, width=720, height=1650, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=wind, width=720,
      height=1650, dpi=320, isGoogleDevice=false).code */
      val WIND = "spec:width=720,height=1650,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Redmi, code=xaga, width=1080, height=2460, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=xaga, width=1080,
      height=2460, dpi=440, isGoogleDevice=false).code */
      val XAGA = "spec:width=1080,height=2460,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=xagain, width=1080, height=2460, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=xagain, width=1080,
      height=2460, dpi=440, isGoogleDevice=false).code */
      val XAGAIN = "spec:width=1080,height=2460,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=xagapro, width=1080, height=2460, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=xagapro, width=1080,
      height=2460, dpi=440, isGoogleDevice=false).code */
      val XAGAPRO = "spec:width=1080,height=2460,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=XIG02, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=XIG02, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val XIG02 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=XIG03, width=1080, height=2460, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=XIG03, width=1080,
      height=2460, dpi=440, isGoogleDevice=false).code */
      val XIG03 = "spec:width=1080,height=2460,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Redmi, code=XIG05, width=1220, height=2712, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=XIG05, width=1220,
      height=2712, dpi=480, isGoogleDevice=false).code */
      val XIG05 = "spec:width=1220,height=2712,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Redmi, code=xun, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=xun, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val XUN = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Redmi, code=yunluo, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=yunluo, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val YUNLUO = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Redmi, code=zircon, width=1220, height=2712, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=zircon, width=1220,
      height=2712, dpi=480, isGoogleDevice=false).code */
      val ZIRCON = "spec:width=1220,height=2712,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Redmi, code=zorn, width=1440, height=3200, dpi=600,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Redmi, code=zorn, width=1440,
      height=3200, dpi=600, isGoogleDevice=false).code */
      val ZORN = "spec:width=1440,height=3200,unit=px,dpi=600"

  }
